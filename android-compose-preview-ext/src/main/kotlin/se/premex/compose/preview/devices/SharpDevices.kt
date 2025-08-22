package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Sharp device specifications for Android Compose previews.
 *
 * This extension provides Sharp device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Sharp.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Sharp: Any
  get() = object {
      /** Sharp AG3 */
      val AG3 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Sharp bruno */
      val BRUNO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** Sharp bumblebee */
      val BUMBLEBEE = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** Sharp Cruze_Lite_S */
      val CRUZE_LITE_S = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Sharp Cruze_Pro */
      val CRUZE_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Sharp expo */
      val EXPO = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Sharp kaitak */
      val KAITAK = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Sharp laoshan */
      val LAOSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Sharp SE3 */
      val SE3 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Sharp SE3_TH */
      val SE3_TH = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Sharp SE3_VN */
      val SE3_VN = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Sharp shilin */
      val SHILIN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Sharp SH-A01 */
      val SH_A01 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Sharp SJ3 */
      val SJ3 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Sharp SK3 */
      val SK3 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Sharp SW4H_FF */
      val SW4H_FF = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
