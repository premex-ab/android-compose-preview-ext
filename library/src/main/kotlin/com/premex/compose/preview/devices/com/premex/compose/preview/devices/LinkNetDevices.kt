package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * LinkNet device specifications for Android Compose previews.
 *
 * This extension provides LinkNet device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.LinkNet.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.LinkNet: Any
  get() = object {
      /** DeviceSpec(manufacturer=LinkNet, code=DCN88_72604_LN, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LinkNet, code=DCN88_72604_LN,
      width=720, height=1280, dpi=213, isGoogleDevice=false).code */
      val DCN88_72604_LN = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=LinkNet, code=DMTS21LC, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LinkNet, code=DMTS21LC, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val DMTS21LC = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LinkNet, code=DTC2140, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LinkNet, code=DTC2140, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val DTC2140 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LinkNet, code=DTC2160, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LinkNet, code=DTC2160, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val DTC2160 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LinkNet, code=DTC9565, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LinkNet, code=DTC9565, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val DTC9565 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LinkNet, code=DTP2162, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LinkNet, code=DTP2162, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val DTP2162 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LinkNet, code=DTP9718, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LinkNet, code=DTP9718, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val DTP9718 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
