package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * HP device specifications for Android Compose previews.
 *
 * This extension provides HP device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.HP.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.HP: Any
  get() = object {
      /** DeviceSpec(manufacturer=HP, code=Fir, width=768, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HP, code=Fir, width=768,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val FIR = "spec:width=768,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=HP, code=Holly, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HP, code=Holly, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val HOLLY = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=HP, code=Ilex, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HP, code=Ilex, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val ILEX = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=HP, code=pangyo, width=2160, height=3840, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HP, code=pangyo, width=2160,
      height=3840, dpi=320, isGoogleDevice=false).code */
      val PANGYO = "spec:width=2160,height=3840,unit=px,dpi=320"

  }
