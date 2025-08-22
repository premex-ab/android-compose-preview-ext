package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Symphony device specifications for Android Compose previews.
 *
 * This extension provides Symphony device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Symphony.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Symphony: Any
  get() = object {
      /** DeviceSpec(manufacturer=Symphony, code=ATOM, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=ATOM, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val ATOM = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Symphony, code=Atom3, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=Atom3, width=720,
      height=1600, dpi=280, isGoogleDevice=false).code */
      val ATOM3 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Symphony, code=ATOM4, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=ATOM4, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val ATOM4 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Symphony, code=Atom_ii, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=Atom_ii, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val ATOM_II = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Symphony, code=E90, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=E90, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val E90 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Symphony, code=E95, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=E95, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val E95 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Symphony, code=G10, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=G10, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val G10 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Symphony, code=G100, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=G100, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val G100 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Symphony, code=G10plus, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=G10plus, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val G10PLUS = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Symphony, code=G26, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=G26, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val G26 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Symphony, code=G27, width=720, height=1612, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=G27, width=720,
      height=1612, dpi=280, isGoogleDevice=false).code */
      val G27 = "spec:width=720,height=1612,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Symphony, code=G27_Lite, width=720, height=1612, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=G27_Lite, width=720,
      height=1612, dpi=280, isGoogleDevice=false).code */
      val G27_LITE = "spec:width=720,height=1612,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Symphony, code=G50, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=G50, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val G50 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Symphony, code=H300, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=H300, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val H300 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Symphony, code=H400, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=H400, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val H400 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Symphony, code=helio_30, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=helio_30,
      width=1080, height=2400, dpi=480, isGoogleDevice=false).code */
      val HELIO_30 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Symphony, code=helio_80, width=1080, height=2412, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=helio_80,
      width=1080, height=2412, dpi=480, isGoogleDevice=false).code */
      val HELIO_80 = "spec:width=1080,height=2412,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Symphony, code=Helio_S60, width=1080, height=2246, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=Helio_S60,
      width=1080, height=2246, dpi=480, isGoogleDevice=false).code */
      val HELIO_S60 = "spec:width=1080,height=2246,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Symphony, code=i10, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=i10, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val I10 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Symphony, code=i100, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=i100, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val I100 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Symphony, code=i10_plus, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=i10_plus, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val I10_PLUS = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Symphony, code=i12, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=i12, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val I12 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Symphony, code=i120, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=i120, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val I120 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Symphony, code=i15, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=i15, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val I15 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Symphony, code=i18, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=i18, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val I18 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Symphony, code=i20, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=i20, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val I20 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Symphony, code=i30, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=i30, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val I30 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Symphony, code=i32, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=i32, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val I32 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Symphony, code=i50, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=i50, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val I50 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Symphony, code=i60, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=i60, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val I60 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Symphony, code=i65, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=i65, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val I65 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Symphony, code=i66, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=i66, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val I66 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Symphony, code=i67, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=i67, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val I67 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Symphony, code=i69, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=i69, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val I69 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Symphony, code=i71, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=i71, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val I71 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Symphony, code=i72, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=i72, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val I72 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Symphony, code=i73, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=i73, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val I73 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Symphony, code=i80, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=i80, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val I80 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Symphony, code=i85, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=i85, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val I85 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Symphony, code=i90, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=i90, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val I90 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Symphony, code=i95, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=i95, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val I95 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Symphony, code=i96, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=i96, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val I96 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Symphony, code=i97, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=i97, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val I97 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Symphony, code=i98, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=i98, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val I98 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Symphony, code=i99, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=i99, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val I99 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Symphony, code=innova10, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=innova10, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val INNOVA10 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Symphony, code=innova20, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=innova20, width=720,
      height=1600, dpi=280, isGoogleDevice=false).code */
      val INNOVA20 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Symphony, code=innova30, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=innova30, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val INNOVA30 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Symphony, code=innova_40, width=720, height=1600, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=innova_40,
      width=720, height=1600, dpi=480, isGoogleDevice=false).code */
      val INNOVA_40 = "spec:width=720,height=1600,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Symphony, code=P11, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=P11, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val P11 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Symphony, code=P6_PRO, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=P6_PRO, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val P6_PRO = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Symphony, code=P7_PRO, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=P7_PRO, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val P7_PRO = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Symphony, code=P8_PRO, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=P8_PRO, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val P8_PRO = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Symphony, code=P9, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=P9, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val P9 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Symphony, code=P9_Plus, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=P9_Plus, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val P9_PLUS = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Symphony, code=R100, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=R100, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val R100 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Symphony, code=R20, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=R20, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val R20 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Symphony, code=R30, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=R30, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val R30 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Symphony, code=roarV95, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=roarV95, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val ROARV95 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Symphony, code=roar_V150, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=roar_V150,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val ROAR_V150 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Symphony, code=Roar_V78, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=Roar_V78, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val ROAR_V78 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Symphony, code=Symphonyi25, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=Symphonyi25,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val SYMPHONYI25 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Symphony, code=Symphony_Z12, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=Symphony_Z12,
      width=720, height=1560, dpi=320, isGoogleDevice=false).code */
      val SYMPHONY_Z12 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Symphony, code=Symphony_Z50, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=Symphony_Z50,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val SYMPHONY_Z50 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Symphony, code=SYMTAB25, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=SYMTAB25, width=600,
      height=1024, dpi=213, isGoogleDevice=false).code */
      val SYMTAB25 = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Symphony, code=SYMTAB60, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=SYMTAB60, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val SYMTAB60 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Symphony, code=SYMTAB_80, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=SYMTAB_80,
      width=800, height=1280, dpi=240, isGoogleDevice=false).code */
      val SYMTAB_80 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Symphony, code=V100, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=V100, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val V100 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Symphony, code=V102, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=V102, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val V102 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Symphony, code=V105, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=V105, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val V105 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Symphony, code=V110, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=V110, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val V110 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Symphony, code=V120, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=V120, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val V120 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Symphony, code=V130, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=V130, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val V130 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Symphony, code=V138, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=V138, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val V138 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Symphony, code=V138Lite, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=V138Lite, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val V138LITE = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Symphony, code=V139, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=V139, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val V139 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Symphony, code=V140, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=V140, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val V140 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Symphony, code=V141, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=V141, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val V141 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Symphony, code=V142, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=V142, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val V142 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Symphony, code=V145, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=V145, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val V145 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Symphony, code=V155, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=V155, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val V155 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Symphony, code=V34, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=V34, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val V34 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Symphony, code=V44, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=V44, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val V44 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Symphony, code=V47, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=V47, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val V47 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Symphony, code=V48, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=V48, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val V48 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Symphony, code=V65, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=V65, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val V65 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Symphony, code=V75, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=V75, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val V75 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Symphony, code=V75m, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=V75m, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val V75M = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Symphony, code=V85, width=540, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=V85, width=540,
      height=960, dpi=240, isGoogleDevice=false).code */
      val V85 = "spec:width=540,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Symphony, code=V92, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=V92, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val V92 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Symphony, code=V94, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=V94, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val V94 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Symphony, code=V96, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=V96, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val V96 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Symphony, code=V97, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=V97, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val V97 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Symphony, code=V98, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=V98, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val V98 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Symphony, code=V99, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=V99, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val V99 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Symphony, code=V99plus, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=V99plus, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val V99PLUS = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Symphony, code=Z10, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=Z10, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val Z10 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Symphony, code=Z15, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=Z15, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val Z15 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Symphony, code=Z16, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=Z16, width=720,
      height=1600, dpi=280, isGoogleDevice=false).code */
      val Z16 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Symphony, code=Z18, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=Z18, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val Z18 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Symphony, code=Z20, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=Z20, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val Z20 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Symphony, code=Z22, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=Z22, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val Z22 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Symphony, code=Z25, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=Z25, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val Z25 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Symphony, code=Z28, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=Z28, width=720,
      height=1600, dpi=280, isGoogleDevice=false).code */
      val Z28 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Symphony, code=Z30, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=Z30, width=720,
      height=1600, dpi=280, isGoogleDevice=false).code */
      val Z30 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Symphony, code=Z30_pro, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=Z30_pro, width=720,
      height=1600, dpi=280, isGoogleDevice=false).code */
      val Z30_PRO = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Symphony, code=Z32, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=Z32, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val Z32 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Symphony, code=Z33, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=Z33, width=720,
      height=1600, dpi=280, isGoogleDevice=false).code */
      val Z33 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Symphony, code=Z35, width=720, height=1640, dpi=260,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=Z35, width=720,
      height=1640, dpi=260, isGoogleDevice=false).code */
      val Z35 = "spec:width=720,height=1640,unit=px,dpi=260"

      /** DeviceSpec(manufacturer=Symphony, code=Z40, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=Z40, width=720,
      height=1600, dpi=280, isGoogleDevice=false).code */
      val Z40 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Symphony, code=Z42, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=Z42, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val Z42 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Symphony, code=Z42_pro, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=Z42_pro, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val Z42_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Symphony, code=Z45, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=Z45, width=720,
      height=1600, dpi=280, isGoogleDevice=false).code */
      val Z45 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Symphony, code=Z55, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=Z55, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val Z55 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Symphony, code=Z60, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=Z60, width=720,
      height=1600, dpi=280, isGoogleDevice=false).code */
      val Z60 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Symphony, code=Z60_plus, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=Z60_plus, width=720,
      height=1600, dpi=280, isGoogleDevice=false).code */
      val Z60_PLUS = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Symphony, code=Z70, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=Z70, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val Z70 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Symphony, code=Z72, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=Z72, width=720,
      height=1640, dpi=320, isGoogleDevice=false).code */
      val Z72 = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Symphony, code=Z9, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=Z9, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val Z9 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Symphony, code=ZVII, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=ZVII, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val ZVII = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Symphony, code=ZVIII, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Symphony, code=ZVIII, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val ZVIII = "spec:width=1080,height=1920,unit=px,dpi=480"

  }
