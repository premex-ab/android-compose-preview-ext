package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Fobem device specifications for Android Compose previews.
 *
 * This extension provides Fobem device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Fobem.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Fobem: Any
  get() = object {
      /** Fobem marina */
      val MARINA = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Fobem nagata */
      val NAGATA = "spec:width=720,height=1280,unit=px,dpi=213"

  }
