package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * StylosTech device specifications for Android Compose previews.
 *
 * This extension provides StylosTech device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.StylosTech.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.StylosTech: Any
  get() = object {
      /** DeviceSpec(manufacturer=StylosTech, code=Tab2, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=StylosTech, code=Tab2, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val TAB2 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=StylosTech, code=TAB4, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=StylosTech, code=TAB4, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val TAB4 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
