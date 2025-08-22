package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Sylvania device specifications for Android Compose previews.
 *
 * This extension provides Sylvania device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Sylvania.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Sylvania: Any
  get() = object {
      /** Sylvania mdt1005_mk_32 */
      val MDT1005_MK_32 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
