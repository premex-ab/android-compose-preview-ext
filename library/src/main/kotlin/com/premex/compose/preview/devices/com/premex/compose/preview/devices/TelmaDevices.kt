package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Telma device specifications for Android Compose previews.
 *
 * This extension provides Telma device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Telma.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Telma: Any
  get() = object {
      /** DeviceSpec(manufacturer=Telma, code=IFeel_Max_4G, width=480, height=854, dpi=212,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Telma, code=IFeel_Max_4G,
      width=480, height=854, dpi=212, isGoogleDevice=false).code */
      val IFEEL_MAX_4G = "spec:width=480,height=854,unit=px,dpi=212"

      /** DeviceSpec(manufacturer=Telma, code=S_Max, width=720, height=1520, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Telma, code=S_Max, width=720,
      height=1520, dpi=300, isGoogleDevice=false).code */
      val S_MAX = "spec:width=720,height=1520,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=Telma, code=Telma_F1Prime4G, width=720, height=1520, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Telma, code=Telma_F1Prime4G,
      width=720, height=1520, dpi=300, isGoogleDevice=false).code */
      val TELMA_F1PRIME4G = "spec:width=720,height=1520,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=Telma, code=Telma_F1XS4G, width=640, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Telma, code=Telma_F1XS4G,
      width=640, height=1280, dpi=320, isGoogleDevice=false).code */
      val TELMA_F1XS4G = "spec:width=640,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Telma, code=Telma_F1_Max_4G, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Telma, code=Telma_F1_Max_4G,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val TELMA_F1_MAX_4G = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Telma, code=Telma_S_Prime, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Telma, code=Telma_S_Prime,
      width=720, height=1520, dpi=320, isGoogleDevice=false).code */
      val TELMA_S_PRIME = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Telma, code=Telma_Titan_4G, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Telma, code=Telma_Titan_4G,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val TELMA_TITAN_4G = "spec:width=720,height=1280,unit=px,dpi=320"

  }
