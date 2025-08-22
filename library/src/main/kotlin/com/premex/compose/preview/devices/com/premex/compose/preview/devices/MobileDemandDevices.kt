package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MobileDemand device specifications for Android Compose previews.
 *
 * This extension provides MobileDemand device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MobileDemand.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MobileDemand: Any
  get() = object {
      /** DeviceSpec(manufacturer=MobileDemand, code=Flex10AND, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MobileDemand, code=Flex10AND,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val FLEX10AND = "spec:width=1200,height=1920,unit=px,dpi=240"

  }
