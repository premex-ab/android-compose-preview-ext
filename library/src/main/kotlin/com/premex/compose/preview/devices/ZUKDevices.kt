package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ZUK device specifications for Android Compose previews.
 *
 * This extension provides ZUK device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ZUK.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ZUK: Any
  get() = object {
      /** ZUK k9 */
      val K9 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** ZUK Z1 */
      val Z1 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** ZUK z2_plus */
      val Z2_PLUS = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** ZUK z2_plus_hw */
      val Z2_PLUS_HW = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** ZUK z2_row */
      val Z2_ROW = "spec:width=1080,height=1920,unit=px,dpi=480"

  }
