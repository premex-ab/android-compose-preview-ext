package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * TASKPHONE device specifications for Android Compose previews.
 *
 * This extension provides TASKPHONE device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Taskphone.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Taskphone: Any
  get() = object {
      /** TASKPHONE T20P */
      val T20P = "spec:width=720,height=1440,unit=px,dpi=320"

  }
