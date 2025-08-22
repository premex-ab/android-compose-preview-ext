package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * MTEK device specifications for Android Compose previews.
 *
 * This extension provides MTEK device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Mtek.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Mtek: Any
  get() = object {
      /** MTEK hongkong */
      val HONGKONG = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** MTEK mountbaker */
      val MOUNTBAKER = "spec:width=720,height=1280,unit=px,dpi=213"

      /** MTEK stanford */
      val STANFORD = "spec:width=720,height=1280,unit=px,dpi=213"

      /** MTEK zhongshan */
      val ZHONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
