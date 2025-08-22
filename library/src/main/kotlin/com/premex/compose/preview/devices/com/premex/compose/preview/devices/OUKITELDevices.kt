package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * OUKITEL device specifications for Android Compose previews.
 *
 * This extension provides OUKITEL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.OUKITEL.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.OUKITEL: Any
  get() = object {
      /** DeviceSpec(manufacturer=OUKITEL, code=C10, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=C10, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val C10 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=OUKITEL, code=C11, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=C11, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val C11 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=OUKITEL, code=C11_Pro, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=C11_Pro, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val C11_PRO = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OUKITEL, code=C11_S, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=C11_S, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val C11_S = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OUKITEL, code=C12, width=480, height=996, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=C12, width=480,
      height=996, dpi=240, isGoogleDevice=false).code */
      val C12 = "spec:width=480,height=996,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=OUKITEL, code=C12_Plus, width=480, height=996, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=C12_Plus, width=480,
      height=996, dpi=240, isGoogleDevice=false).code */
      val C12_PLUS = "spec:width=480,height=996,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=OUKITEL, code=C12_Pro, width=480, height=996, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=C12_Pro, width=480,
      height=996, dpi=240, isGoogleDevice=false).code */
      val C12_PRO = "spec:width=480,height=996,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=OUKITEL, code=C13_Pro, width=480, height=996, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=C13_Pro, width=480,
      height=996, dpi=240, isGoogleDevice=false).code */
      val C13_PRO = "spec:width=480,height=996,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=OUKITEL, code=C15_Pro, width=600, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=C15_Pro, width=600,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val C15_PRO = "spec:width=600,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=OUKITEL, code=C16, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=C16, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val C16 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OUKITEL, code=C16_Pro, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=C16_Pro, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val C16_PRO = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OUKITEL, code=C17_Pro, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=C17_Pro, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val C17_PRO = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OUKITEL, code=C18_Pro, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=C18_Pro, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val C18_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OUKITEL, code=C19, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=C19, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val C19 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OUKITEL, code=C19_Pro, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=C19_Pro, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val C19_PRO = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OUKITEL, code=C1_Pro, width=576, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=C1_Pro, width=576,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val C1_PRO = "spec:width=576,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=OUKITEL, code=C21, width=1080, height=2310, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=C21, width=1080,
      height=2310, dpi=480, isGoogleDevice=false).code */
      val C21 = "spec:width=1080,height=2310,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OUKITEL, code=C21_Plus, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=C21_Plus, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val C21_PLUS = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OUKITEL, code=C21_Pro, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=C21_Pro, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val C21_PRO = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OUKITEL, code=C22, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=C22, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val C22 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OUKITEL, code=C23_Pro, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=C23_Pro, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val C23_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OUKITEL, code=C25, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=C25, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val C25 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OUKITEL, code=C31, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=C31, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val C31 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OUKITEL, code=C31_Pro, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=C31_Pro, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val C31_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OUKITEL, code=C32, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=C32, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val C32 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OUKITEL, code=C33, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=C33, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val C33 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OUKITEL, code=C35, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=C35, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val C35 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OUKITEL, code=C36, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=C36, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val C36 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OUKITEL, code=C37, width=1080, height=2408, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=C37, width=1080,
      height=2408, dpi=480, isGoogleDevice=false).code */
      val C37 = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OUKITEL, code=C38, width=1080, height=2408, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=C38, width=1080,
      height=2408, dpi=480, isGoogleDevice=false).code */
      val C38 = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OUKITEL, code=C50, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=C50, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val C50 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OUKITEL, code=C51, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=C51, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val C51 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OUKITEL, code=C53, width=720, height=1612, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=C53, width=720,
      height=1612, dpi=280, isGoogleDevice=false).code */
      val C53 = "spec:width=720,height=1612,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=OUKITEL, code=C57_Pro, width=576, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=C57_Pro, width=576,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val C57_PRO = "spec:width=576,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=OUKITEL, code=C57_S, width=576, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=C57_S, width=576,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val C57_S = "spec:width=576,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=OUKITEL, code=C58, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=C58, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val C58 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OUKITEL, code=C58_Pro, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=C58_Pro, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val C58_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OUKITEL, code=C59_Pro, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=C59_Pro, width=720,
      height=1640, dpi=320, isGoogleDevice=false).code */
      val C59_PRO = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OUKITEL, code=C61_Pro, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=C61_Pro, width=720,
      height=1640, dpi=320, isGoogleDevice=false).code */
      val C61_PRO = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OUKITEL, code=C65, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=C65, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val C65 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OUKITEL, code=C65_Pro, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=C65_Pro, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val C65_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OUKITEL, code=C8, width=640, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=C8, width=640,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val C8 = "spec:width=640,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OUKITEL, code=C8_4G, width=640, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=C8_4G, width=640,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val C8_4G = "spec:width=640,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OUKITEL, code=C9, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=C9, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val C9 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OUKITEL, code=G1, width=576, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=G1, width=576,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val G1 = "spec:width=576,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=OUKITEL, code=G2, width=576, height=1152, dpi=260,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=G2, width=576,
      height=1152, dpi=260, isGoogleDevice=false).code */
      val G2 = "spec:width=576,height=1152,unit=px,dpi=260"

      /** DeviceSpec(manufacturer=OUKITEL, code=K10, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=K10, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val K10 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OUKITEL, code=K10000_Max, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=K10000_Max,
      width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val K10000_MAX = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OUKITEL, code=K10000_Mix, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=K10000_Mix,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val K10000_MIX = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OUKITEL, code=K10000_Pro, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=K10000_Pro,
      width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val K10000_PRO = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OUKITEL, code=K12, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=K12, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val K12 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OUKITEL, code=K13_Pro, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=K13_Pro, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val K13_PRO = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OUKITEL, code=K15_Plus, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=K15_Plus, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val K15_PLUS = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OUKITEL, code=K15_Pro, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=K15_Pro, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val K15_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OUKITEL, code=K16, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=K16, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val K16 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OUKITEL, code=K3, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=K3, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val K3 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OUKITEL, code=K3_Pro, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=K3_Pro, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val K3_PRO = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OUKITEL, code=K5, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=K5, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val K5 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OUKITEL, code=K5000, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=K5000, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val K5000 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OUKITEL, code=K6, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=K6, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val K6 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OUKITEL, code=K6000_Plus, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=K6000_Plus,
      width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val K6000_PLUS = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OUKITEL, code=K7_Power, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=K7_Power, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val K7_POWER = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OUKITEL, code=K7_Pro, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=K7_Pro, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val K7_PRO = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OUKITEL, code=K8, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=K8, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val K8 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OUKITEL, code=K8000, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=K8000, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val K8000 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OUKITEL, code=K9, width=1080, height=2244, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=K9, width=1080,
      height=2244, dpi=480, isGoogleDevice=false).code */
      val K9 = "spec:width=1080,height=2244,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OUKITEL, code=K9_Pro, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=K9_Pro, width=720,
      height=1640, dpi=320, isGoogleDevice=false).code */
      val K9_PRO = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OUKITEL, code=MIX_2, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=MIX_2, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val MIX_2 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OUKITEL, code=OK6000_Plus, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=OK6000_Plus,
      width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val OK6000_PLUS = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OUKITEL, code=OKT1, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=OKT1, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val OKT1 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OUKITEL, code=OKT3, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=OKT3, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val OKT3 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OUKITEL, code=OT11, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=OT11, width=800,
      height=1280, dpi=180, isGoogleDevice=false).code */
      val OT11 = "spec:width=800,height=1280,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=OUKITEL, code=OT12, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=OT12, width=800,
      height=1280, dpi=180, isGoogleDevice=false).code */
      val OT12 = "spec:width=800,height=1280,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=OUKITEL, code=OT5, width=1200, height=2000, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=OT5, width=1200,
      height=2000, dpi=320, isGoogleDevice=false).code */
      val OT5 = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OUKITEL, code=OT5_S, width=1200, height=2000, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=OT5_S, width=1200,
      height=2000, dpi=300, isGoogleDevice=false).code */
      val OT5_S = "spec:width=1200,height=2000,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=OUKITEL, code=OT6, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=OT6, width=800,
      height=1280, dpi=180, isGoogleDevice=false).code */
      val OT6 = "spec:width=800,height=1280,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=OUKITEL, code=OT6_Kids, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=OT6_Kids, width=800,
      height=1280, dpi=180, isGoogleDevice=false).code */
      val OT6_KIDS = "spec:width=800,height=1280,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=OUKITEL, code=OT6_Pro, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=OT6_Pro, width=800,
      height=1280, dpi=180, isGoogleDevice=false).code */
      val OT6_PRO = "spec:width=800,height=1280,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=OUKITEL, code=OT8, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=OT8, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val OT8 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OUKITEL, code=OT9, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=OT9, width=800,
      height=1280, dpi=180, isGoogleDevice=false).code */
      val OT9 = "spec:width=800,height=1280,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=OUKITEL, code=OUKITEL_C1, width=576, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=OUKITEL_C1,
      width=576, height=1280, dpi=213, isGoogleDevice=false).code */
      val OUKITEL_C1 = "spec:width=576,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=OUKITEL, code=OUKITEL_C59, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=OUKITEL_C59,
      width=720, height=1640, dpi=320, isGoogleDevice=false).code */
      val OUKITEL_C59 = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OUKITEL, code=OUKITEL_C61, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=OUKITEL_C61,
      width=720, height=1640, dpi=320, isGoogleDevice=false).code */
      val OUKITEL_C61 = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OUKITEL, code=OUKITEL_G5, width=576, height=1152, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=OUKITEL_G5,
      width=576, height=1152, dpi=213, isGoogleDevice=false).code */
      val OUKITEL_G5 = "spec:width=576,height=1152,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=OUKITEL, code=OUKITEL_K7, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=OUKITEL_K7,
      width=1080, height=2160, dpi=480, isGoogleDevice=false).code */
      val OUKITEL_K7 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OUKITEL, code=OUKITEL_P1, width=1080, height=2412, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=OUKITEL_P1,
      width=1080, height=2412, dpi=480, isGoogleDevice=false).code */
      val OUKITEL_P1 = "spec:width=1080,height=2412,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OUKITEL, code=OUKITEL_WP1, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=OUKITEL_WP1,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val OUKITEL_WP1 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OUKITEL, code=OUKITEL_WP36, width=576, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=OUKITEL_WP36,
      width=576, height=1280, dpi=240, isGoogleDevice=false).code */
      val OUKITEL_WP36 = "spec:width=576,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=OUKITEL, code=OUKITEL_WP38, width=576, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=OUKITEL_WP38,
      width=576, height=1280, dpi=240, isGoogleDevice=false).code */
      val OUKITEL_WP38 = "spec:width=576,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=OUKITEL, code=P07, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=P07, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val P07 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OUKITEL, code=RT1, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=RT1, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val RT1 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OUKITEL, code=RT2, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=RT2, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val RT2 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OUKITEL, code=RT3, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=RT3, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val RT3 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=OUKITEL, code=RT3_EEA, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=RT3_EEA, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val RT3_EEA = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=OUKITEL, code=RT3_Pro, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=RT3_Pro, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val RT3_PRO = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=OUKITEL, code=RT5, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=RT5, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val RT5 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OUKITEL, code=RT6, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=RT6, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val RT6 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OUKITEL, code=RT7_TITAN, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=RT7_TITAN,
      width=1200, height=1920, dpi=320, isGoogleDevice=false).code */
      val RT7_TITAN = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OUKITEL, code=RT8, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=RT8, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val RT8 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OUKITEL, code=RT9, width=800, height=1280, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=RT9, width=800,
      height=1280, dpi=200, isGoogleDevice=false).code */
      val RT9 = "spec:width=800,height=1280,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=OUKITEL, code=S105B, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=S105B, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val S105B = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OUKITEL, code=S109, width=1080, height=2408, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=S109, width=1080,
      height=2408, dpi=480, isGoogleDevice=false).code */
      val S109 = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OUKITEL, code=S111, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=S111, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val S111 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OUKITEL, code=S115, width=1080, height=2408, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=S115, width=1080,
      height=2408, dpi=480, isGoogleDevice=false).code */
      val S115 = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OUKITEL, code=S118, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=S118, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val S118 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OUKITEL, code=U11_Plus, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=U11_Plus, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val U11_PLUS = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OUKITEL, code=U18, width=720, height=1512, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=U18, width=720,
      height=1512, dpi=320, isGoogleDevice=false).code */
      val U18 = "spec:width=720,height=1512,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OUKITEL, code=U20_Plus, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=U20_Plus, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val U20_PLUS = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OUKITEL, code=U22, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=U22, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val U22 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OUKITEL, code=U23, width=1080, height=2246, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=U23, width=1080,
      height=2246, dpi=480, isGoogleDevice=false).code */
      val U23 = "spec:width=1080,height=2246,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OUKITEL, code=U25_Pro, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=U25_Pro, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val U25_PRO = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OUKITEL, code=WP10, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=WP10, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val WP10 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OUKITEL, code=WP100_TITAN, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=WP100_TITAN,
      width=1080, height=2460, dpi=480, isGoogleDevice=false).code */
      val WP100_TITAN = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OUKITEL, code=WP12, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=WP12, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val WP12 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OUKITEL, code=WP12_Pro, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=WP12_Pro, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val WP12_PRO = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OUKITEL, code=WP13, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=WP13, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val WP13 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OUKITEL, code=WP15, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=WP15, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val WP15 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OUKITEL, code=WP15_S, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=WP15_S, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val WP15_S = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OUKITEL, code=WP16, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=WP16, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val WP16 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OUKITEL, code=WP17, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=WP17, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val WP17 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OUKITEL, code=WP18_EEA, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=WP18_EEA, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val WP18_EEA = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OUKITEL, code=WP18_P_R_EEA, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=WP18_P_R_EEA,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val WP18_P_R_EEA = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OUKITEL, code=WP19, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=WP19, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val WP19 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OUKITEL, code=WP19_Pro, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=WP19_Pro, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val WP19_PRO = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OUKITEL, code=WP2, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=WP2, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val WP2 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OUKITEL, code=WP20, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=WP20, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val WP20 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OUKITEL, code=WP200_Pro, width=1080, height=2412, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=WP200_Pro,
      width=1080, height=2412, dpi=480, isGoogleDevice=false).code */
      val WP200_PRO = "spec:width=1080,height=2412,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OUKITEL, code=WP20_Pro, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=WP20_Pro, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val WP20_PRO = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OUKITEL, code=WP21, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=WP21, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val WP21 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OUKITEL, code=WP21_U, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=WP21_U, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val WP21_U = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OUKITEL, code=WP23_Plus, width=576, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=WP23_Plus, width=576,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val WP23_PLUS = "spec:width=576,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=OUKITEL, code=WP27, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=WP27, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val WP27 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OUKITEL, code=WP28_E, width=576, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=WP28_E, width=576,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val WP28_E = "spec:width=576,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=OUKITEL, code=WP28_S, width=576, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=WP28_S, width=576,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val WP28_S = "spec:width=576,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=OUKITEL, code=WP300, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=WP300, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val WP300 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OUKITEL, code=WP30_Pro, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=WP30_Pro, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val WP30_PRO = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OUKITEL, code=WP32, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=WP32, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val WP32 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OUKITEL, code=WP32_Pro_U, width=576, height=1152, dpi=260,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=WP32_Pro_U,
      width=576, height=1152, dpi=260, isGoogleDevice=false).code */
      val WP32_PRO_U = "spec:width=576,height=1152,unit=px,dpi=260"

      /** DeviceSpec(manufacturer=OUKITEL, code=WP33_Pro, width=1080, height=2408, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=WP33_Pro, width=1080,
      height=2408, dpi=480, isGoogleDevice=false).code */
      val WP33_PRO = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OUKITEL, code=WP35, width=1080, height=2408, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=WP35, width=1080,
      height=2408, dpi=480, isGoogleDevice=false).code */
      val WP35 = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OUKITEL, code=WP35_Pro, width=1080, height=2408, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=WP35_Pro, width=1080,
      height=2408, dpi=480, isGoogleDevice=false).code */
      val WP35_PRO = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OUKITEL, code=WP35_S, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=WP35_S, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val WP35_S = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OUKITEL, code=WP36, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=WP36, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val WP36 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OUKITEL, code=WP36_Pro, width=576, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=WP36_Pro, width=576,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val WP36_PRO = "spec:width=576,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=OUKITEL, code=WP38, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=WP38, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val WP38 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OUKITEL, code=WP39, width=1080, height=2408, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=WP39, width=1080,
      height=2408, dpi=480, isGoogleDevice=false).code */
      val WP39 = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OUKITEL, code=WP39_Pro, width=1080, height=2408, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=WP39_Pro, width=1080,
      height=2408, dpi=480, isGoogleDevice=false).code */
      val WP39_PRO = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OUKITEL, code=WP5, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=WP5, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val WP5 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OUKITEL, code=WP50, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=WP50, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val WP50 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OUKITEL, code=WP5000, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=WP5000, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val WP5000 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OUKITEL, code=WP52, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=WP52, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val WP52 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OUKITEL, code=WP55, width=1080, height=2408, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=WP55, width=1080,
      height=2408, dpi=480, isGoogleDevice=false).code */
      val WP55 = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OUKITEL, code=WP5_Pro, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=WP5_Pro, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val WP5_PRO = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OUKITEL, code=WP6, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=WP6, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val WP6 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OUKITEL, code=WP7, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=WP7, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val WP7 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OUKITEL, code=WP8_Pro, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=WP8_Pro, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val WP8_PRO = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OUKITEL, code=WP9, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=WP9, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val WP9 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OUKITEL, code=Y1000, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=Y1000, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val Y1000 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OUKITEL, code=Y4800, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUKITEL, code=Y4800, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val Y4800 = "spec:width=1080,height=2340,unit=px,dpi=480"

  }
