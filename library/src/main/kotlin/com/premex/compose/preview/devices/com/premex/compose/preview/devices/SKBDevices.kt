package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SKB device specifications for Android Compose previews.
 *
 * This extension provides SKB device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SKB.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SKB: Any
  get() = object {
      /** DeviceSpec(manufacturer=SKB, code=BFX-AT100, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SKB, code=BFX-AT100, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val BFX_AT100 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SKB, code=BFX-UA300, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SKB, code=BFX-UA300, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val BFX_UA300 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SKB, code=BIP-AI100, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SKB, code=BIP-AI100, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val BIP_AI100 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SKB, code=BIP-EB100, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SKB, code=BIP-EB100, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val BIP_EB100 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SKB, code=BIP-UW200, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SKB, code=BIP-UW200, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val BIP_UW200 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SKB, code=BMA-AI100, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SKB, code=BMA-AI100, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val BMA_AI100 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SKB, code=INTEKS20SI, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SKB, code=INTEKS20SI, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val INTEKS20SI = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SKB, code=INTEKS21SI, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SKB, code=INTEKS21SI, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val INTEKS21SI = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
