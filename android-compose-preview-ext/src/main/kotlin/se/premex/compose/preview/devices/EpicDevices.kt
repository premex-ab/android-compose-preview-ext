package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * EPIC device specifications for Android Compose previews.
 *
 * This extension provides EPIC device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Epic.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Epic: Any
  get() = object {
      /** EPIC martin */
      val MARTIN = "spec:width=720,height=1280,unit=px,dpi=213"

      /** EPIC patrick */
      val PATRICK = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
