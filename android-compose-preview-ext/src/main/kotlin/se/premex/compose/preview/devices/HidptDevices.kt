package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * HiDPT device specifications for Android Compose previews.
 *
 * This extension provides HiDPT device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Hidpt.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Hidpt: Any
  get() = object {
      /** HiDPT Hi3751V350 */
      val HI3751V350 = "spec:width=720,height=1280,unit=px,dpi=160"

  }
