package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * att device specifications for Android Compose previews.
 *
 * This extension provides att device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Att.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Att: Any
  get() = object {
      /** DeviceSpec(manufacturer=att, code=v340u, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=att, code=v340u, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val V340U = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=att, code=v341u, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=att, code=v341u, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val V341U = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=att, code=v350u, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=att, code=v350u, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val V350U = "spec:width=720,height=1520,unit=px,dpi=320"

  }
