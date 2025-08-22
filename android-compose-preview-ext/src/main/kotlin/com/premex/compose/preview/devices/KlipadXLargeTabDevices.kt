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
 * @Preview(device = Devices.KlipadXLargeTab.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.KlipadXLargeTab: Any
  get() = object {
      /** KLIPAD-X-LARGE-TAB KL_6888 */
      val KL_6888 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
