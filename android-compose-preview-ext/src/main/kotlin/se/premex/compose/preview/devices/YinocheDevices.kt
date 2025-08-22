package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * YINOCHE device specifications for Android Compose previews.
 *
 * This extension provides YINOCHE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Yinoche.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Yinoche: Any
  get() = object {
      /** YINOCHE R8 */
      val R8 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** YINOCHE Y8 */
      val Y8 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
