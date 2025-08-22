package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * QUBER device specifications for Android Compose previews.
 *
 * This extension provides QUBER device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.QUBER.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.QUBER: Any
  get() = object {
      /** DeviceSpec(manufacturer=QUBER, code=QA3O_M110, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QUBER, code=QA3O_M110, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val QA3O_M110 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
