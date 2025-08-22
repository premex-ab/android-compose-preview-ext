package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * DANEW device specifications for Android Compose previews.
 *
 * This extension provides DANEW device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.DANEW.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.DANEW: Any
  get() = object {
      /** DeviceSpec(manufacturer=DANEW, code=DANEW_Konnect_556, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DANEW, code=DANEW_Konnect_556,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val DANEW_KONNECT_556 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DANEW, code=Konnect_557, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DANEW, code=Konnect_557, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val KONNECT_557 = "spec:width=720,height=1440,unit=px,dpi=320"

  }
