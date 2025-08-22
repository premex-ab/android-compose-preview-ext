package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TABI_by_t_go device specifications for Android Compose previews.
 *
 * This extension provides TABI_by_t_go device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TABIbytgo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TABIbytgo: Any
  get() = object {
      /** DeviceSpec(manufacturer=TABI_by_t_go, code=TGO_TB1001_2R, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TABI_by_t_go, code=TGO_TB1001_2R,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val TGO_TB1001_2R = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=TABI_by_t_go, code=TGO_TB1001_4R, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TABI_by_t_go, code=TGO_TB1001_4R,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val TGO_TB1001_4R = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=TABI_by_t_go, code=TGO_TB1001_4RO, width=800, height=1280,
      dpi=160, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TABI_by_t_go,
      code=TGO_TB1001_4RO, width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val TGO_TB1001_4RO = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=TABI_by_t_go, code=TGO_TB780i, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TABI_by_t_go, code=TGO_TB780i,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val TGO_TB780I = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=TABI_by_t_go, code=TGO_TB780ik, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TABI_by_t_go, code=TGO_TB780ik,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val TGO_TB780IK = "spec:width=600,height=1024,unit=px,dpi=160"

  }
