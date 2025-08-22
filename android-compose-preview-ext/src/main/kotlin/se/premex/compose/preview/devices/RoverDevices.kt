package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * ROVER device specifications for Android Compose previews.
 *
 * This extension provides ROVER device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Rover.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Rover: Any
  get() = object {
      /** ROVER CHIPPY */
      val CHIPPY = "spec:width=720,height=1600,unit=px,dpi=300"

      /** ROVER R10_M */
      val R10_M = "spec:width=800,height=1280,unit=px,dpi=220"

      /** ROVER R8 */
      val R8 = "spec:width=800,height=1280,unit=px,dpi=220"

  }
