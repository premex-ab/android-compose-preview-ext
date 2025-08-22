package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * NASCO device specifications for Android Compose previews.
 *
 * This extension provides NASCO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Nasco.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Nasco: Any
  get() = object {
      /** NASCO NAS-400 */
      val NAS_400 = "spec:width=480,height=800,unit=px,dpi=240"

      /** NASCO NAS-503 */
      val NAS_503 = "spec:width=480,height=960,unit=px,dpi=240"

      /** NASCO NAS-510 */
      val NAS_510 = "spec:width=480,height=960,unit=px,dpi=240"

  }
