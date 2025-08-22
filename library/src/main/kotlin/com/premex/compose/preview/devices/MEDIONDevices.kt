package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MEDION device specifications for Android Compose previews.
 *
 * This extension provides MEDION device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MEDION.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MEDION: Any
  get() = object {
      /** MEDION B4570 */
      val B4570 = "spec:width=480,height=854,unit=px,dpi=240"

      /** MEDION B5032 */
      val B5032 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** MEDION B5060 */
      val B5060 = "spec:width=480,height=854,unit=px,dpi=240"

      /** MEDION B5070 */
      val B5070 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** MEDION B5530 */
      val B5530 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** MEDION B5531 */
      val B5531 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** MEDION B5532 */
      val B5532 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** MEDION E1041X */
      val E1041X = "spec:width=800,height=1280,unit=px,dpi=160"

      /** MEDION E1042X */
      val E1042X = "spec:width=800,height=1280,unit=px,dpi=160"

      /** MEDION E1043X */
      val E1043X = "spec:width=800,height=1280,unit=px,dpi=160"

      /** MEDION E1050X */
      val E1050X = "spec:width=800,height=1280,unit=px,dpi=160"

      /** MEDION E1051X */
      val E1051X = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** MEDION E1053X */
      val E1053X = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** MEDION E1060X */
      val E1060X = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** MEDION E1070X */
      val E1070X = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** MEDION E1071X */
      val E1071X = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** MEDION E1081X */
      val E1081X = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** MEDION E1090X */
      val E1090X = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** MEDION E691X */
      val E691X = "spec:width=720,height=1280,unit=px,dpi=213"

      /** MEDION LIFETAB_E10310 */
      val LIFETAB_E10310 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** MEDION LIFETAB_E10316 */
      val LIFETAB_E10316 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** MEDION LIFETAB_E10320 */
      val LIFETAB_E10320 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** MEDION LIFETAB_E7310 */
      val LIFETAB_E7310 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** MEDION LIFETAB_E7316 */
      val LIFETAB_E7316 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** MEDION lifetab_p733x */
      val LIFETAB_P733X = "spec:width=800,height=1280,unit=px,dpi=213"

      /** MEDION lifetab_p831x */
      val LIFETAB_P831X = "spec:width=800,height=1280,unit=px,dpi=213"

      /** MEDION lifetab_p891x */
      val LIFETAB_P891X = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** MEDION lifetab_p970x */
      val LIFETAB_P970X = "spec:width=1536,height=2048,unit=px,dpi=320"

      /** MEDION LIFETAB_S1033X */
      val LIFETAB_S1033X = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** MEDION lifetab_s1034x */
      val LIFETAB_S1034X = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** MEDION lifetab_s1036x */
      val LIFETAB_S1036X = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** MEDION LIFETAB_S785X */
      val LIFETAB_S785X = "spec:width=768,height=1024,unit=px,dpi=160"

      /** MEDION LIFETAB_S831X */
      val LIFETAB_S831X = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** MEDION P1032X */
      val P1032X = "spec:width=800,height=1280,unit=px,dpi=160"

      /** MEDION P1035X */
      val P1035X = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** MEDION P1050X */
      val P1050X = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** MEDION P1060X */
      val P1060X = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** MEDION P1061X */
      val P1061X = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** MEDION P1071X */
      val P1071X = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** MEDION P1075X */
      val P1075X = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** MEDION P1091X */
      val P1091X = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** MEDION P740X */
      val P740X = "spec:width=600,height=1024,unit=px,dpi=160"

      /** MEDION P850X */
      val P850X = "spec:width=800,height=1280,unit=px,dpi=213"

      /** MEDION P851X */
      val P851X = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** MEDION P852X */
      val P852X = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** MEDION S1032X */
      val S1032X = "spec:width=800,height=1280,unit=px,dpi=160"

      /** MEDION S1035X */
      val S1035X = "spec:width=800,height=1280,unit=px,dpi=160"

      /** MEDION S5004 */
      val S5004 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** MEDION S9714 */
      val S9714 = "spec:width=752,height=1280,unit=px,dpi=160"

      /** MEDION X1030X */
      val X1030X = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** MEDION X1031X */
      val X1031X = "spec:width=1200,height=1920,unit=px,dpi=240"

  }
