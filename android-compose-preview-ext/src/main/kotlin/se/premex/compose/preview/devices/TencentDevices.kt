package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Tencent device specifications for Android Compose previews.
 *
 * This extension provides Tencent device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Tencent.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Tencent: Any
  get() = object {
      /** Tencent virtual_machine_2 */
      val VIRTUAL_MACHINE_2 = "spec:width=900,height=1600,unit=px,dpi=240"

  }
