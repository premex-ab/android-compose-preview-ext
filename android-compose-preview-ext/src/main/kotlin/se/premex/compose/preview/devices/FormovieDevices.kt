package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Formovie device specifications for Android Compose previews.
 *
 * This extension provides Formovie device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Formovie.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Formovie: Any
  get() = object {
      /** Formovie koroli */
      val KOROLI = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
