package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * IRA_explore_more device specifications for Android Compose previews.
 *
 * This extension provides IRA_explore_more device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.IRAexploremore.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.IRAexploremore: Any
  get() = object {
      /** DeviceSpec(manufacturer=IRA_explore_more, code=IRA_BHARATAB_1021, width=800, height=1280,
      dpi=240, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IRA_explore_more,
      code=IRA_BHARATAB_1021, width=800, height=1280, dpi=240, isGoogleDevice=false).code */
      val IRA_BHARATAB_1021 = "spec:width=800,height=1280,unit=px,dpi=240"

  }
