package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * VIZZION device specifications for Android Compose previews.
 *
 * This extension provides VIZZION device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Vizzion.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Vizzion: Any
  get() = object {
      /** VIZZION stanford */
      val STANFORD = "spec:width=720,height=1280,unit=px,dpi=213"

      /** VIZZION SW4H */
      val SW4H = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** VIZZION zhongshan */
      val ZHONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
