package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Human_Academy device specifications for Android Compose previews.
 *
 * This extension provides Human_Academy device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.HumanAcademy.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.HumanAcademy: Any
  get() = object {
      /** Human_Academy HA-008 */
      val HA_008 = "spec:width=800,height=1280,unit=px,dpi=180"

  }
