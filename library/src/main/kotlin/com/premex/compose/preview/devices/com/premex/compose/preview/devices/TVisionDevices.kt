package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TVision device specifications for Android Compose previews.
 *
 * This extension provides TVision device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TVision.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TVision: Any
  get() = object {
      /** DeviceSpec(manufacturer=TVision, code=SEI400TM, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TVision, code=SEI400TM, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val SEI400TM = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TVision, code=SEI700TM, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TVision, code=SEI700TM, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val SEI700TM = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
