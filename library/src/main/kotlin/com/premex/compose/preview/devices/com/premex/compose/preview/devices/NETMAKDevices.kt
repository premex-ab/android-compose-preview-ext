package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * NETMAK device specifications for Android Compose previews.
 *
 * This extension provides NETMAK device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.NETMAK.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.NETMAK: Any
  get() = object {
      /** DeviceSpec(manufacturer=NETMAK, code=NM_VELOCITY, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NETMAK, code=NM_VELOCITY,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val NM_VELOCITY = "spec:width=600,height=1024,unit=px,dpi=160"

  }
