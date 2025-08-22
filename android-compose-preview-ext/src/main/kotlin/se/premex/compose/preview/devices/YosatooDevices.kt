package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * YosaToo device specifications for Android Compose previews.
 *
 * This extension provides YosaToo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Yosatoo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Yosatoo: Any
  get() = object {
      /** YosaToo Y10 */
      val Y10 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** YosaToo Y101 */
      val Y101 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** YosaToo Y102 */
      val Y102 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
