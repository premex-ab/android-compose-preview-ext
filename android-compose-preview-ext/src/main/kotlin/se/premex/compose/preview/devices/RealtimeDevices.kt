package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Realtime device specifications for Android Compose previews.
 *
 * This extension provides Realtime device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Realtime.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Realtime: Any
  get() = object {
      /** Realtime Realtime_T503F_L1 */
      val REALTIME_T503F_L1 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Realtime RT8 */
      val RT8 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
