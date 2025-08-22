package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ADVANCE device specifications for Android Compose previews.
 *
 * This extension provides ADVANCE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ADVANCE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ADVANCE: Any
  get() = object {
      /** DeviceSpec(manufacturer=ADVANCE, code=HL9000, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ADVANCE, code=HL9000, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val HL9000 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ADVANCE, code=NP6050, width=1200, height=2000, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ADVANCE, code=NP6050, width=1200,
      height=2000, dpi=320, isGoogleDevice=false).code */
      val NP6050 = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ADVANCE, code=NP6070, width=1200, height=1920, dpi=340,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ADVANCE, code=NP6070, width=1200,
      height=1920, dpi=340, isGoogleDevice=false).code */
      val NP6070 = "spec:width=1200,height=1920,unit=px,dpi=340"

      /** DeviceSpec(manufacturer=ADVANCE, code=Pr5747, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ADVANCE, code=Pr5747, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val PR5747 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=ADVANCE, code=PR5860, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ADVANCE, code=PR5860, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val PR5860 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=ADVANCE, code=Pr6146, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ADVANCE, code=Pr6146, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val PR6146 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=ADVANCE, code=PR6149, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ADVANCE, code=PR6149, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val PR6149 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=ADVANCE, code=PR6152, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ADVANCE, code=PR6152, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val PR6152 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=ADVANCE, code=PR6152-ADV, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ADVANCE, code=PR6152-ADV,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val PR6152_ADV = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=ADVANCE, code=SP4702, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ADVANCE, code=SP4702, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val SP4702 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ADVANCE, code=SP4703, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ADVANCE, code=SP4703, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val SP4703 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=ADVANCE, code=SP4871, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ADVANCE, code=SP4871, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val SP4871 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=ADVANCE, code=SP4872, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ADVANCE, code=SP4872, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val SP4872 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=ADVANCE, code=SP5702, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ADVANCE, code=SP5702, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val SP5702 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ADVANCE, code=SP5705, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ADVANCE, code=SP5705, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val SP5705 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=ADVANCE, code=SP5712, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ADVANCE, code=SP5712, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val SP5712 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ADVANCE, code=SP5713, width=1200, height=2000, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ADVANCE, code=SP5713, width=1200,
      height=2000, dpi=320, isGoogleDevice=false).code */
      val SP5713 = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ADVANCE, code=Sp5730, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ADVANCE, code=Sp5730, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val SP5730 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=ADVANCE, code=SP5732, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ADVANCE, code=SP5732, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val SP5732 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ADVANCE, code=SP5736, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ADVANCE, code=SP5736, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val SP5736 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=ADVANCE, code=SP5760, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ADVANCE, code=SP5760, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val SP5760 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ADVANCE, code=SP5775, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ADVANCE, code=SP5775, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val SP5775 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=ADVANCE, code=SP5776, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ADVANCE, code=SP5776, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val SP5776 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=ADVANCE, code=SP7248, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ADVANCE, code=SP7248, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val SP7248 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=ADVANCE, code=SP7348, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ADVANCE, code=SP7348, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val SP7348 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ADVANCE, code=Tablet_adv_v1, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ADVANCE, code=Tablet_adv_v1,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val TABLET_ADV_V1 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=ADVANCE, code=TR3947, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ADVANCE, code=TR3947, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val TR3947 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=ADVANCE, code=TR5994, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ADVANCE, code=TR5994, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val TR5994 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=ADVANCE, code=TR5996, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ADVANCE, code=TR5996, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val TR5996 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=ADVANCE, code=TR6948, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ADVANCE, code=TR6948, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val TR6948 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=ADVANCE, code=TR7988, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ADVANCE, code=TR7988, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val TR7988 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=ADVANCE, code=TR7989, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ADVANCE, code=TR7989, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val TR7989 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=ADVANCE, code=TR7990, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ADVANCE, code=TR7990, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val TR7990 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=ADVANCE, code=TR7998, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ADVANCE, code=TR7998, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TR7998 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=ADVANCE, code=TR8990, width=600, height=1024, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ADVANCE, code=TR8990, width=600,
      height=1024, dpi=200, isGoogleDevice=false).code */
      val TR8990 = "spec:width=600,height=1024,unit=px,dpi=200"

  }
