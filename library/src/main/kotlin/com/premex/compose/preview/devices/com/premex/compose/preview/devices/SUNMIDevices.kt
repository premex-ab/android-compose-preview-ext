package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SUNMI device specifications for Android Compose previews.
 *
 * This extension provides SUNMI device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SUNMI.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SUNMI: Any
  get() = object {
      /** DeviceSpec(manufacturer=SUNMI, code=D3MINI, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SUNMI, code=D3MINI, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val D3MINI = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=SUNMI, code=D3_PRO, width=1080, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SUNMI, code=D3_PRO, width=1080,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val D3_PRO = "spec:width=1080,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=SUNMI, code=K2, width=1080, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SUNMI, code=K2, width=1080,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val K2 = "spec:width=1080,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=SUNMI, code=SUNMI-L2HNFC, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SUNMI, code=SUNMI-L2HNFC,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val SUNMI_L2HNFC = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SUNMI, code=SUNMI-L2KsNFC, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SUNMI, code=SUNMI-L2KsNFC,
      width=480, height=800, dpi=240, isGoogleDevice=false).code */
      val SUNMI_L2KSNFC = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=SUNMI, code=SUNMI-L2s_PRO, width=720, height=1440, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SUNMI, code=SUNMI-L2s_PRO,
      width=720, height=1440, dpi=280, isGoogleDevice=false).code */
      val SUNMI_L2S_PRO = "spec:width=720,height=1440,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=SUNMI, code=T3_PRO, width=1080, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SUNMI, code=T3_PRO, width=1080,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val T3_PRO = "spec:width=1080,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=SUNMI, code=V2s, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SUNMI, code=V2s, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val V2S = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SUNMI, code=V2sNC, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SUNMI, code=V2sNC, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val V2SNC = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SUNMI, code=V2sPLUSNC, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SUNMI, code=V2sPLUSNC, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val V2SPLUSNC = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SUNMI, code=V3, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SUNMI, code=V3, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val V3 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SUNMI, code=V3_MIX, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SUNMI, code=V3_MIX, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val V3_MIX = "spec:width=800,height=1280,unit=px,dpi=160"

  }
