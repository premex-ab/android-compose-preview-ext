package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SKY_Devices device specifications for Android Compose previews.
 *
 * This extension provides SKY_Devices device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SKYDevices.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SKYDevices: Any
  get() = object {
      /** DeviceSpec(manufacturer=SKY_Devices, code=Elite_T10_PRO, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SKY_Devices, code=Elite_T10_PRO,
      width=800, height=1280, dpi=180, isGoogleDevice=false).code */
      val ELITE_T10_PRO = "spec:width=800,height=1280,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=SKY_Devices, code=Elite_T11_Maxlt, width=1200, height=1920,
      dpi=240, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SKY_Devices,
      code=Elite_T11_Maxlt, width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val ELITE_T11_MAXLT = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=SKY_Devices, code=SKY_PAD10MAXEXUS, width=800, height=1280,
      dpi=213, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SKY_Devices,
      code=SKY_PAD10MAXEXUS, width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val SKY_PAD10MAXEXUS = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=SKY_Devices, code=SKY_PAD8PROUSON, width=800, height=1280,
      dpi=213, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SKY_Devices,
      code=SKY_PAD8PROUSON, width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val SKY_PAD8PROUSON = "spec:width=800,height=1280,unit=px,dpi=213"

  }
