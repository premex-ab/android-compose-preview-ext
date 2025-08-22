package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * VIVAX device specifications for Android Compose previews.
 *
 * This extension provides VIVAX device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Vivax.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Vivax: Any
  get() = object {
      /** VIVAX FUN_S20 */
      val FUN_S20 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** VIVAX longshan */
      val LONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** VIVAX MID7015A-MK */
      val MID7015A_MK = "spec:width=600,height=1024,unit=px,dpi=160"

      /** VIVAX Point_X2 */
      val POINT_X2 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** VIVAX Point_X502 */
      val POINT_X502 = "spec:width=480,height=960,unit=px,dpi=240"

      /** VIVAX Point_X503 */
      val POINT_X503 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** VIVAX stanford */
      val STANFORD = "spec:width=720,height=1280,unit=px,dpi=213"

      /** VIVAX TPC-102_4G */
      val TPC_102_4G = "spec:width=800,height=1280,unit=px,dpi=160"

      /** VIVAX TPC_8043G */
      val TPC_8043G = "spec:width=800,height=1280,unit=px,dpi=213"

      /** VIVAX TPC_8053G */
      val TPC_8053G = "spec:width=800,height=1280,unit=px,dpi=160"

      /** VIVAX TPC_8063G */
      val TPC_8063G = "spec:width=800,height=1280,unit=px,dpi=213"

      /** VIVAX TPC_8074G */
      val TPC_8074G = "spec:width=800,height=1280,unit=px,dpi=213"

      /** VIVAX VIVAX_Fly6 */
      val VIVAX_FLY6 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** VIVAX VIVAX_Fly_V1 */
      val VIVAX_FLY_V1 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** VIVAX VIVAX_PRO3 */
      val VIVAX_PRO3 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** VIVAX VIVAX_TPC-105_4G */
      val VIVAX_TPC_105_4G = "spec:width=800,height=1280,unit=px,dpi=213"

      /** VIVAX zhongshan */
      val ZHONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
