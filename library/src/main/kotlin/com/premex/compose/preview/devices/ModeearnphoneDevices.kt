package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ModeEarnPhone device specifications for Android Compose previews.
 *
 * This extension provides ModeEarnPhone device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Modeearnphone.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Modeearnphone: Any
  get() = object {
      /** ModeEarnPhone MEP2 */
      val MEP2 = "spec:width=720,height=1600,unit=px,dpi=320"

  }
