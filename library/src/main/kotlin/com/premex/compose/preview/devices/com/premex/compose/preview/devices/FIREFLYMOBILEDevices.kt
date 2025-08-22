package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * FIREFLY_MOBILE device specifications for Android Compose previews.
 *
 * This extension provides FIREFLY_MOBILE device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.FIREFLYMOBILE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.FIREFLYMOBILE: Any
  get() = object {
      /** DeviceSpec(manufacturer=FIREFLY_MOBILE, code=INTENSE_XT, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FIREFLY_MOBILE, code=INTENSE_XT,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val INTENSE_XT = "spec:width=480,height=960,unit=px,dpi=240"

  }
