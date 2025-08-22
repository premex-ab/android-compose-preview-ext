package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * KLIPAD-X-LARGE-TAB device specifications for Android Compose previews.
 *
 * This extension provides KLIPAD-X-LARGE-TAB device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.KLIPADXLARGETAB.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.KLIPADXLARGETAB: Any
  get() = object {
      /** DeviceSpec(manufacturer=KLIPAD-X-LARGE-TAB, code=KL_6888, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KLIPAD-X-LARGE-TAB, code=KL_6888,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val KL_6888 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
