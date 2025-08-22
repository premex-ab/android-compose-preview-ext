package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * XTRATECH_IGUANAPAD device specifications for Android Compose previews.
 *
 * This extension provides XTRATECH_IGUANAPAD device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.XTRATECHIGUANAPAD.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.XTRATECHIGUANAPAD: Any
  get() = object {
      /** DeviceSpec(manufacturer=XTRATECH_IGUANAPAD, code=X8MT16, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=XTRATECH_IGUANAPAD, code=X8MT16,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val X8MT16 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
