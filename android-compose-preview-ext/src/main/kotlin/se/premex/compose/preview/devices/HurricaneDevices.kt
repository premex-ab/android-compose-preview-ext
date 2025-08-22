package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * HURRICANE device specifications for Android Compose previews.
 *
 * This extension provides HURRICANE device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Hurricane.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Hurricane: Any
  get() = object {
      /** HURRICANE Iris_Plus */
      val IRIS_PLUS = "spec:width=480,height=800,unit=px,dpi=240"

  }
