package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * EVEREST-EVERPAD device specifications for Android Compose previews.
 *
 * This extension provides EVEREST-EVERPAD device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.EVERESTEVERPAD.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.EVERESTEVERPAD: Any
  get() = object {
      /** DeviceSpec(manufacturer=EVEREST-EVERPAD, code=DC-M700, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EVEREST-EVERPAD, code=DC-M700,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val DC_M700 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=EVEREST-EVERPAD, code=mid1032_mk, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EVEREST-EVERPAD, code=mid1032_mk,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val MID1032_MK = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=EVEREST-EVERPAD, code=MID7015A-MK, width=600, height=1024,
      dpi=160, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EVEREST-EVERPAD,
      code=MID7015A-MK, width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val MID7015A_MK = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=EVEREST-EVERPAD, code=mid7015_mk, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EVEREST-EVERPAD, code=mid7015_mk,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val MID7015_MK = "spec:width=600,height=1024,unit=px,dpi=160"

  }
