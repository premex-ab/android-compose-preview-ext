package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ANXONIT device specifications for Android Compose previews.
 *
 * This extension provides ANXONIT device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Anxonit.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Anxonit: Any
  get() = object {
      /** ANXONIT AnPad_U2 */
      val ANPAD_U2 = "spec:width=1200,height=1920,unit=px,dpi=320"

  }
