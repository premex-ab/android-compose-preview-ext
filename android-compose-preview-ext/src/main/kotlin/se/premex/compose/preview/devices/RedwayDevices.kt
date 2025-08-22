package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * redway device specifications for Android Compose previews.
 *
 * This extension provides redway device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Redway.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Redway: Any
  get() = object {
      /** redway redway10 */
      val REDWAY10 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** redway redway10_lite */
      val REDWAY10_LITE = "spec:width=800,height=1280,unit=px,dpi=160"

      /** redway redway7_pro */
      val REDWAY7_PRO = "spec:width=600,height=1024,unit=px,dpi=160"

  }
