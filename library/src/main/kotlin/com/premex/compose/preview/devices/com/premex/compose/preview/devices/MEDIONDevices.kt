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
      /** DeviceSpec(manufacturer=MEDION, code=B4570, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MEDION, code=B4570, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val B4570 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=MEDION, code=B5032, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MEDION, code=B5032, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val B5032 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=MEDION, code=B5060, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MEDION, code=B5060, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val B5060 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=MEDION, code=B5070, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MEDION, code=B5070, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val B5070 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=MEDION, code=B5530, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MEDION, code=B5530, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val B5530 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=MEDION, code=B5531, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MEDION, code=B5531, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val B5531 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=MEDION, code=B5532, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MEDION, code=B5532, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val B5532 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=MEDION, code=E1041X, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MEDION, code=E1041X, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val E1041X = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=MEDION, code=E1042X, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MEDION, code=E1042X, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val E1042X = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=MEDION, code=E1043X, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MEDION, code=E1043X, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val E1043X = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=MEDION, code=E1050X, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MEDION, code=E1050X, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val E1050X = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=MEDION, code=E1051X, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MEDION, code=E1051X, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val E1051X = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=MEDION, code=E1053X, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MEDION, code=E1053X, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val E1053X = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=MEDION, code=E1060X, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MEDION, code=E1060X, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val E1060X = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=MEDION, code=E1070X, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MEDION, code=E1070X, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val E1070X = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=MEDION, code=E1071X, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MEDION, code=E1071X, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val E1071X = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=MEDION, code=E1081X, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MEDION, code=E1081X, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val E1081X = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=MEDION, code=E1090X, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MEDION, code=E1090X, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val E1090X = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=MEDION, code=E691X, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MEDION, code=E691X, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val E691X = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=MEDION, code=LIFETAB_E10310, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MEDION, code=LIFETAB_E10310,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val LIFETAB_E10310 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=MEDION, code=LIFETAB_E10316, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MEDION, code=LIFETAB_E10316,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val LIFETAB_E10316 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=MEDION, code=LIFETAB_E10320, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MEDION, code=LIFETAB_E10320,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val LIFETAB_E10320 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=MEDION, code=LIFETAB_E7310, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MEDION, code=LIFETAB_E7310,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val LIFETAB_E7310 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=MEDION, code=LIFETAB_E7316, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MEDION, code=LIFETAB_E7316,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val LIFETAB_E7316 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=MEDION, code=lifetab_p733x, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MEDION, code=lifetab_p733x,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val LIFETAB_P733X = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=MEDION, code=lifetab_p831x, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MEDION, code=lifetab_p831x,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val LIFETAB_P831X = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=MEDION, code=lifetab_p891x, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MEDION, code=lifetab_p891x,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val LIFETAB_P891X = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=MEDION, code=lifetab_p970x, width=1536, height=2048, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MEDION, code=lifetab_p970x,
      width=1536, height=2048, dpi=320, isGoogleDevice=false).code */
      val LIFETAB_P970X = "spec:width=1536,height=2048,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=MEDION, code=LIFETAB_S1033X, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MEDION, code=LIFETAB_S1033X,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val LIFETAB_S1033X = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=MEDION, code=lifetab_s1034x, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MEDION, code=lifetab_s1034x,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val LIFETAB_S1034X = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=MEDION, code=lifetab_s1036x, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MEDION, code=lifetab_s1036x,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val LIFETAB_S1036X = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=MEDION, code=LIFETAB_S785X, width=768, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MEDION, code=LIFETAB_S785X,
      width=768, height=1024, dpi=160, isGoogleDevice=false).code */
      val LIFETAB_S785X = "spec:width=768,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=MEDION, code=LIFETAB_S831X, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MEDION, code=LIFETAB_S831X,
      width=1200, height=1920, dpi=320, isGoogleDevice=false).code */
      val LIFETAB_S831X = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=MEDION, code=P1032X, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MEDION, code=P1032X, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val P1032X = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=MEDION, code=P1035X, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MEDION, code=P1035X, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val P1035X = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=MEDION, code=P1050X, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MEDION, code=P1050X, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val P1050X = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=MEDION, code=P1060X, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MEDION, code=P1060X, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val P1060X = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=MEDION, code=P1061X, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MEDION, code=P1061X, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val P1061X = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=MEDION, code=P1071X, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MEDION, code=P1071X, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val P1071X = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=MEDION, code=P1075X, width=1200, height=2000, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MEDION, code=P1075X, width=1200,
      height=2000, dpi=240, isGoogleDevice=false).code */
      val P1075X = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=MEDION, code=P1091X, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MEDION, code=P1091X, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val P1091X = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=MEDION, code=P740X, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MEDION, code=P740X, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val P740X = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=MEDION, code=P850X, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MEDION, code=P850X, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val P850X = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=MEDION, code=P851X, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MEDION, code=P851X, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val P851X = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=MEDION, code=P852X, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MEDION, code=P852X, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val P852X = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=MEDION, code=S1032X, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MEDION, code=S1032X, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val S1032X = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=MEDION, code=S1035X, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MEDION, code=S1035X, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val S1035X = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=MEDION, code=S5004, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MEDION, code=S5004, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val S5004 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=MEDION, code=S9714, width=752, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MEDION, code=S9714, width=752,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val S9714 = "spec:width=752,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=MEDION, code=X1030X, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MEDION, code=X1030X, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val X1030X = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=MEDION, code=X1031X, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MEDION, code=X1031X, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val X1031X = "spec:width=1200,height=1920,unit=px,dpi=240"

  }
