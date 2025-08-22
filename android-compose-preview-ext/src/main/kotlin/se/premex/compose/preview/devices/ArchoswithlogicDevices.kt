package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * ArchosWithLogic device specifications for Android Compose previews.
 *
 * This extension provides ArchosWithLogic device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Archoswithlogic.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Archoswithlogic: Any
  get() = object {
      /** ArchosWithLogic ac67x5g */
      val AC67X5G = "spec:width=1080,height=2400,unit=px,dpi=480"

  }
