package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * NEC device specifications for Android Compose previews.
 *
 * This extension provides NEC device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.NEC.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.NEC: Any
  get() = object {
      /** DeviceSpec(manufacturer=NEC, code=D000000039, width=752, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NEC, code=D000000039, width=752,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val D000000039 = "spec:width=752,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=NEC, code=LAVIET11112K1, width=1200, height=2000, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NEC, code=LAVIET11112K1,
      width=1200, height=2000, dpi=240, isGoogleDevice=false).code */
      val LAVIET11112K1 = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=NEC, code=LAVIET1111QHD1, width=1600, height=2560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NEC, code=LAVIET1111QHD1,
      width=1600, height=2560, dpi=320, isGoogleDevice=false).code */
      val LAVIET1111QHD1 = "spec:width=1600,height=2560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=NEC, code=LAVIET77SD1, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NEC, code=LAVIET77SD1, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val LAVIET77SD1 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=NEC, code=LAVIET88HD1, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NEC, code=LAVIET88HD1, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val LAVIET88HD1 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=NEC, code=LaVieTab, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NEC, code=LaVieTab, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val LAVIETAB = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=NEC, code=LAVIETab102K1, width=1200, height=2000, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NEC, code=LAVIETab102K1,
      width=1200, height=2000, dpi=240, isGoogleDevice=false).code */
      val LAVIETAB102K1 = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=NEC, code=LAVIETab10FHD3, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NEC, code=LAVIETab10FHD3,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val LAVIETAB10FHD3 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=NEC, code=LAVIETab112K2, width=1200, height=2000, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NEC, code=LAVIETab112K2,
      width=1200, height=2000, dpi=240, isGoogleDevice=false).code */
      val LAVIETAB112K2 = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=NEC, code=LAVIETab11FHD1, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NEC, code=LAVIETab11FHD1,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val LAVIETAB11FHD1 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=NEC, code=LAVIETab11QHD2, width=1536, height=2560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NEC, code=LAVIETab11QHD2,
      width=1536, height=2560, dpi=320, isGoogleDevice=false).code */
      val LAVIETAB11QHD2 = "spec:width=1536,height=2560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=NEC, code=LAVIETab143K1, width=1876, height=3000, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NEC, code=LAVIETab143K1,
      width=1876, height=3000, dpi=320, isGoogleDevice=false).code */
      val LAVIETAB143K1 = "spec:width=1876,height=3000,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=NEC, code=LAVIETab9QHD1, width=1600, height=2560, dpi=400,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NEC, code=LAVIETab9QHD1,
      width=1600, height=2560, dpi=400, isGoogleDevice=false).code */
      val LAVIETAB9QHD1 = "spec:width=1600,height=2560,unit=px,dpi=400"

      /** DeviceSpec(manufacturer=NEC, code=LAVIETabE10FHD1, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NEC, code=LAVIETabE10FHD1,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val LAVIETABE10FHD1 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=NEC, code=LAVIETabE10FHD2, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NEC, code=LAVIETabE10FHD2,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val LAVIETABE10FHD2 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=NEC, code=LAVIETabE7SD1, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NEC, code=LAVIETabE7SD1, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val LAVIETABE7SD1 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=NEC, code=LAVIETabE8FHD1, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NEC, code=LAVIETabE8FHD1,
      width=1200, height=1920, dpi=320, isGoogleDevice=false).code */
      val LAVIETABE8FHD1 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=NEC, code=LAVIETabE8HD1, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NEC, code=LAVIETabE8HD1, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val LAVIETABE8HD1 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=NEC, code=LAVIETabT1212QHD1, width=1600, height=2560, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NEC, code=LAVIETabT1212QHD1,
      width=1600, height=2560, dpi=240, isGoogleDevice=false).code */
      val LAVIETABT1212QHD1 = "spec:width=1600,height=2560,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=NEC, code=PC-TE410JAW, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NEC, code=PC-TE410JAW, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val PC_TE410JAW = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=NEC, code=PC-TE508HAW, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NEC, code=PC-TE508HAW, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val PC_TE508HAW = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=NEC, code=PC-TE508S1_nec, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NEC, code=PC-TE508S1_nec,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val PC_TE508S1_NEC = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=NEC, code=PC-TE510JAW, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NEC, code=PC-TE510JAW, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val PC_TE510JAW = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=NEC, code=PC-TE510S1_nec, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NEC, code=PC-TE510S1_nec,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val PC_TE510S1_NEC = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=NEC, code=PC-TS507N1S, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NEC, code=PC-TS507N1S, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val PC_TS507N1S = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=NEC, code=PC-TS508FAM, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NEC, code=PC-TS508FAM, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val PC_TS508FAM = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=NEC, code=TE507FAW, width=720, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NEC, code=TE507FAW, width=720,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val TE507FAW = "spec:width=720,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=NEC, code=508T1W, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NEC, code=508T1W, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val _508T1W = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=NEC, code=708T1W, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NEC, code=708T1W, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val _708T1W = "spec:width=1200,height=1920,unit=px,dpi=320"

  }
