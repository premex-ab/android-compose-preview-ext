package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Toshiba device specifications for Android Compose previews.
 *
 * This extension provides Toshiba device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Toshiba.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Toshiba: Any
  get() = object {
      /** Toshiba hamamatsucho */
      val HAMAMATSUCHO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** Toshiba hayward */
      val HAYWARD = "spec:width=720,height=1280,unit=px,dpi=213"

      /** Toshiba hengshan */
      val HENGSHAN = "spec:width=2160,height=3840,unit=px,dpi=320"

      /** Toshiba huangshan */
      val HUANGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Toshiba l4300 */
      val L4300 = "spec:width=1080,height=1920,unit=px,dpi=240"

      /** Toshiba laoshan */
      val LAOSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Toshiba ligen */
      val LIGEN = "spec:width=2160,height=3840,unit=px,dpi=480"

      /** Toshiba lushan */
      val LUSHAN = "spec:width=2160,height=3840,unit=px,dpi=320"

      /** Toshiba shandao */
      val SHANDAO = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Toshiba songshan */
      val SONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Toshiba taishan */
      val TAISHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Toshiba xiaoyushan */
      val XIAOYUSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Toshiba xinnong */
      val XINNONG = "spec:width=2160,height=3840,unit=px,dpi=480"

  }
