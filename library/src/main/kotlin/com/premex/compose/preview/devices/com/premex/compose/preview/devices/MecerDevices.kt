package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Mecer device specifications for Android Compose previews.
 *
 * This extension provides Mecer device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Mecer.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Mecer: Any
  get() = object {
      /** DeviceSpec(manufacturer=Mecer, code=DX10-66, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mecer, code=DX10-66, width=800,
      height=1280, dpi=180, isGoogleDevice=false).code */
      val DX10_66 = "spec:width=800,height=1280,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=Mecer, code=DX10-66-LTE, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mecer, code=DX10-66-LTE, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val DX10_66_LTE = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Mecer, code=M17QF6_3G, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mecer, code=M17QF6_3G, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val M17QF6_3G = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Mecer, code=M17QF6_4G, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mecer, code=M17QF6_4G, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val M17QF6_4G = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Mecer, code=M17QF7_4G, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mecer, code=M17QF7_4G, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val M17QF7_4G = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Mecer, code=M76QF6, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mecer, code=M76QF6, width=600,
      height=1024, dpi=213, isGoogleDevice=false).code */
      val M76QF6 = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Mecer, code=M86Q9-3G, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mecer, code=M86Q9-3G, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val M86Q9_3G = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Mecer, code=MF716_Plus, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mecer, code=MF716_Plus, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val MF716_PLUS = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Mecer, code=MW16Q9_3G, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mecer, code=MW16Q9_3G, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val MW16Q9_3G = "spec:width=800,height=1280,unit=px,dpi=160"

  }
