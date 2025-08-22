package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * StarkFuture device specifications for Android Compose previews.
 *
 * This extension provides StarkFuture device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.StarkFuture.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.StarkFuture: Any
  get() = object {
      /** DeviceSpec(manufacturer=StarkFuture, code=ARKENSTONE, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=StarkFuture, code=ARKENSTONE,
      width=720, height=1612, dpi=320, isGoogleDevice=false).code */
      val ARKENSTONE = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=StarkFuture, code=ARKENSTONE_US, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=StarkFuture, code=ARKENSTONE_US,
      width=720, height=1612, dpi=320, isGoogleDevice=false).code */
      val ARKENSTONE_US = "spec:width=720,height=1612,unit=px,dpi=320"

  }
