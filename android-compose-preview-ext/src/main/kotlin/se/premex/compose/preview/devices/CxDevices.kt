package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * CX device specifications for Android Compose previews.
 *
 * This extension provides CX device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Cx.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Cx: Any
  get() = object {
      /** CX CX9011 */
      val CX9011 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
