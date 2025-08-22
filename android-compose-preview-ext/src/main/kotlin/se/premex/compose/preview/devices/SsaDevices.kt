package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * SSA device specifications for Android Compose previews.
 *
 * This extension provides SSA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Ssa.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Ssa: Any
  get() = object {
      /** SSA MID-1015T */
      val MID_1015T = "spec:width=800,height=1280,unit=px,dpi=160"

  }
