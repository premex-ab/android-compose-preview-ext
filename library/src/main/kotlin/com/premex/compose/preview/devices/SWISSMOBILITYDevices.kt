package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SWISSMOBILITY device specifications for Android Compose previews.
 *
 * This extension provides SWISSMOBILITY device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SWISSMOBILITY.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SWISSMOBILITY: Any
  get() = object {
      /** SWISSMOBILITY B4SWM */
      val B4SWM = "spec:width=720,height=1512,unit=px,dpi=320"

      /** SWISSMOBILITY Z7 */
      val Z7 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
